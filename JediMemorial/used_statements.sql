CREATE TABLE jedi
(
  id INTEGER NOT NULL PRIMARY KEY,
  name VARCHAR2(256)
);

INSERT INTO jedi VALUES ( 1, 'Obi-wan Kenobi');
INSERT INTO jedi VALUES ( 2, 'Master Yoda');
INSERT INTO jedi VALUES ( 3, 'Padawan Timo');

CREATE TABLE jedi_death_event
(
  id INTEGER NOT NULL PRIMARY KEY,
  fk_jedi INTEGER,
  CONSTRAINT jedi_death_event_fk_jedi FOREIGN KEY ( fk_jedi ) REFERENCES jedi ( id ) ON DELETE CASCADE,
  reason VARCHAR2(256)
);

INSERT INTO wf_ext_param ( id, qname, ext_schema, ext_table, ext_col, ext_base_table, ext_base_col )
  VALUES ( wf_ext_param_seq.NEXTVAL, 'jedi.deathEvent.jedi', 'MM_HIVE', 'JEDI_DEATH_EVENT', 'FK_JEDI', 'JEDI_DEATH_EVENT', 'ID');
INSERT INTO wf_ext_param ( id, qname, ext_schema, ext_table, ext_col, ext_base_table, ext_base_col )
  VALUES ( wf_ext_param_seq.NEXTVAL, 'jedi.deathEvent.reason', 'MM_HIVE', 'JEDI_DEATH_EVENT', 'REASON', 'JEDI_DEATH_EVENT', 'ID');
  

INSERT INTO wf_workflow_x_ext_param
SELECT
  w.id fk_workflow,
  ep.id fk_ext_param
FROM
  wf_ext_param ep, wf_workflow w
WHERE
  ep.qname LIKE 'jedi.deathEvent%'
  AND w.qname LIKE 'jedi.kill'
  AND (w.id, ep.id) NOT IN (SELECT * FROM wf_workflow_x_ext_param)
;

SELECT
  w.id fk_workflow,
  ep.id fk_ext_param
FROM
  wf_ext_param ep, wf_workflow w
WHERE
  ep.qname LIKE 'jedi.deathEvent%'
  AND w.qname LIKE 'jedi.kill'
  AND (w.id, ep.id) NOT IN (SELECT * FROM wf_workflow_x_ext_param)
  ;
  
  
create or replace view vw_jedi_memorial as
select
  de.id,
  j.name,
  pi.started death_date,
  de.reason
from 
  jedi_death_event de
  inner join jedi j ON de.fk_jedi = j.id
  inner join mm_hive.wf_process pi on de.id = pi.id
;

GRANT SELECT ON vw_jedi_memorial TO hive_user;