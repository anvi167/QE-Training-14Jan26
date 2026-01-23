--23-01-2026

select * from scott.emp;
select * from scott.dept;

-- traditional join syntax
select emp.ename, dept.dname from scott.emp emp, scott.dept dept where emp.deptno = dept.deptno;

--ANSI join Syntax
select emp.ename, dept.dname from scott.emp emp INNER JOIN scott.dept dept ON emp.deptno = dept.deptno;

--ANSI right joint syntax
select emp.ename, dept.dname from scott.emp emp right JOIN scott.dept dept ON emp.deptno = dept.deptno;

select emp.ename, dept.dname from scott.emp emp full JOIN scott.dept dept ON emp.deptno = dept.deptno;

--challenge activity
--retrieve data from scott.emp to print following data
--emp name, dept name, manager name

select emp.ename,dept.dname from scott.emp emp full outer join scott.dept dept on emp.deptno = dept.deptno where job = "MANAGER";

select emp.ename,dept.dname from scott.emp emp full outer join scott.dept dept on scott.emp.deptno = scott.dept.deptno where job = "MANAGER";

select emp.ename,dept.dname from scott.emp emp right outer join scott.dept dept on emp.deptno = dept.deptno where job = "MANAGER";

select emp.ename as emp_name, dept.dname as dept_name, man.ename as manager_name 



SELECT 
    e.ename  AS emp_name,
    d.dname  AS dept_name,
    m.ename  AS manager_name
FROM scott.emp e
JOIN scott.dept d
    ON e.deptno = d.deptno
LEFT JOIN scott.emp m
    ON e.mgr = m.empno;



--activity 2
-- retrive and display information about all managers
-- in scott.emp and their location 

select emp.empno, dept.dname as dept_name, mng.ename as manager_name, loca.loc as manager_location from scott.emp emp join scott.dept dept on emp.deptno = dept.deptno where scott.emp mgr on emp.mgr = loca.empno;


select distinct e.ename as mname,
       d.loc as location
from scott.emp e
join scott.dept d
on e.deptno = d.deptno
where e.empno in (
    select distinct mgr from scott.emp where mgr is not null
);
select * from scott.emp;

--activity 3
--using hr schema
--retrive employee name, department name and city
--for all employees working in the 'IT' department 

select * from hr.departments;
select * from hr.locations;

SELECT 
    e.first_name || ' ' || e.last_name AS employee_name,
    d.department_name,
    l.city
FROM hr.employees e
JOIN hr.departments d
    ON e.department_id = d.department_id
JOIN hr.locations l
    ON d.location_id = l.location_id
WHERE d.department_name = 'IT';



--by using subquery
SELECT
    e.first_name || ' ' || e.last_name AS employee_name,
    (SELECT d.department_name
     FROM hr.departments d
     WHERE d.department_id = e.department_id) AS department_name,
    (SELECT l.city
     FROM hr.locations l
     WHERE l.location_id =
           (SELECT d.location_id
            FROM hr.departments d
            WHERE d.department_id = e.department_id)
    ) AS city
FROM hr.employees e
WHERE e.department_id =
      (SELECT department_id
       FROM hr.departments
       WHERE department_name = 'IT');



-- activity 4
-- using scott schema
-- list out all the managers along with their empno, name and number of reporters 

SELECT
    m.empno,
    m.ename AS manager_name,
    COUNT(e.empno) AS number_of_reporters
FROM scott.emp m
JOIN scott.emp e
    ON e.mgr = m.empno
GROUP BY m.empno, m.ename
ORDER BY m.empno;

-- by using subquery
select * from scott.emp;select * from scott.dept;
--challenge activity 
----using scott schema
----list out all managers along with their empno, name and number of reportees--
select ename, empno,
(SELECT COUNT(*)
FROM scott.emp e2
WHERE e2.mgr = e1.empno) 
AS number_of_reportees
FROM scott.emp e1
WHERE empno IN (
    SELECT DISTINCT mgr
    FROM scott.emp
    WHERE mgr IS NOT NULL)