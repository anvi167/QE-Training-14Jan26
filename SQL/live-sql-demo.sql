CREATE TABLE salesman(
    Salesman_id int not null,
    salesman_name varchar2(20),
    salesman_city varchar2(20),
    commission int
);

describe salesman;

insert into salesman values (1016, 'Anvitha', 'Pamarru', 22, 4500 );
insert into salesman values (1017, 'Asritha', 'Pamarru', 25, 5600 );
insert into salesman values (1018, 'Nirupama', 'Vizag', 21, 2300 );
insert into salesman values (1019, 'Harsha', 'Palasa', 23, 4700 );
insert into salesman values (1020, 'Swathi', 'Kakinada', 23, 6500 );

SELECT * FROM salesman;

-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Pamarru';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Anvitha';

alter table salesman
add salary int;

insert into salary values

ALTER TABLE salesman
DROP COLUMN salary;

delete from salesman wharer salesman id = 1019;

select depltno. empno from scol  order by 1,2 desc;

select * from scott.emp where sal between 2500 and 3000;
select * from scott.emp where sal <> 5000 and 1300 and 1500 and 1100 and 1250;


select * from salesman;
delete from salesman where salesman_id=1017;
rollback;

--setting initial state
savepoint sp1;
delete from salesman where salesman_id=1019;
--saving after first delete-1019
delete from salesman where salesman_id=1016;
--saving after 2nd delete-1016
savepoint sp3;
rollback to sp2;
select * from salesman;


select count(*) as "Num of salesman" from salesman
select * from scott.emp;
select count(*) from scott.emp;

select sum(sal) from scott.emp;
select max(sal) from scott.emp;
select min(sal) from scott.emp;
select avg(sal) from scott.emp;
select round(avg(sal)) from scott.emp;

select deptno,sum(sal) from scott.emp group by deptno;
select deptno,sum(sal) from scott.emp group by deptno having sum(sal) > 5000 order by deptno;

-- create a query which shows sum of salaries grouped by dept where
-- average dept salary is higher than average salary of all employees

SELECT deptno, SUM(sal) AS total_salary
FROM scott.emp
GROUP BY deptno
HAVING AVG(sal) > (SELECT AVG(sal) FROM scott.emp);