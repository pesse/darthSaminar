select * from person;

select id from (
  select * from person
);





select * 
from 
(
  select 1 as a, 'a' as b from dual
  UNION ALL
  select 2, 'b' from dual
);


create or replace type jedi_record AS OBJECT
(
  name VARCHAR2(256),
  lightsaber_color INTEGER
);
/

create or replace type jedi_table AS TABLE OF jedi_record;
/


create or replace FUNCTION get_jedis RETURN jedi_table
AS
  v_result jedi_table := jedi_table();
BEGIN
  v_result.EXTEND;
  v_result(v_result.LAST) := jedi_record( 'Luke Skywalker', 255);
  
  v_result.EXTEND;
  v_result(v_result.LAST) := jedi_record( 'Yoda', 65280);
  
  v_result.EXTEND;
  v_result(v_result.LAST) := jedi_record( 'Darth Vader', 16711680);
  
  return v_result;
END;
/

select * from table(get_jedis());
