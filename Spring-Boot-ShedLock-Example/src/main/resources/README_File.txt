spring boot Shedlock example :-



mysql>
mysql> CREATE TABLE test_schema.shedlock (
    ->     name VARCHAR(64) PRIMARY KEY,
    ->     lock_until TIMESTAMP NOT NULL,
    ->     locked_at TIMESTAMP NOT NULL DEFAULT NOW(),
    ->     locked_by VARCHAR(255) NOT NULL
    -> );
Query OK, 0 rows affected (0.022 sec)

mysql> desc shedlock
    -> ;
+------------+--------------+------+-----+-------------------+-------------------+
| Field      | Type         | Null | Key | Default           | Extra             |
+------------+--------------+------+-----+-------------------+-------------------+
| name       | varchar(64)  | NO   | PRI | NULL              |                   |
| lock_until | timestamp    | NO   |     | NULL              |                   |
| locked_at  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| locked_by  | varchar(255) | NO   |     | NULL              |                   |
+------------+--------------+------+-----+-------------------+-------------------+
4 rows in set (0.005 sec)

mysql> select * from shedlock;
Empty set (0.006 sec)

mysql> select * from shedlock;
Empty set (0.003 sec)




start the application instance 1 -> mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=9191"

start the application instance 2 -> mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=9192"



mysql> select * from shedlock;
+----------------+---------------------+---------------------+--------------------------+
| name           | lock_until          | locked_at           | locked_by                |
+----------------+---------------------+---------------------+--------------------------+
| uniqueTaskName | 2026-01-03 20:28:07 | 2026-01-03 20:28:05 | Umeshs-MacBook-Pro.local |
+----------------+---------------------+---------------------+--------------------------+
1 row in set (0.002 sec)

mysql> select * from shedlock;
+----------------+---------------------+---------------------+--------------------------+
| name           | lock_until          | locked_at           | locked_by                |
+----------------+---------------------+---------------------+--------------------------+
| uniqueTaskName | 2026-01-03 20:28:17 | 2026-01-03 20:28:15 | Umeshs-MacBook-Pro.local |
+----------------+---------------------+---------------------+--------------------------+
1 row in set (0.001 sec)

mysql> select * from shedlock;
+----------------+---------------------+---------------------+--------------------------+
| name           | lock_until          | locked_at           | locked_by                |
+----------------+---------------------+---------------------+--------------------------+
| uniqueTaskName | 2026-01-03 20:28:19 | 2026-01-03 20:28:17 | Umeshs-MacBook-Pro.local |
+----------------+---------------------+---------------------+--------------------------+
1 row in set (0.001 sec)

mysql>
mysql> select * from shedlock;
+----------------+---------------------+---------------------+--------------------------+
| name           | lock_until          | locked_at           | locked_by                |
+----------------+---------------------+---------------------+--------------------------+
| uniqueTaskName | 2026-01-03 20:28:23 | 2026-01-03 20:28:21 | Umeshs-MacBook-Pro.local |
+----------------+---------------------+---------------------+--------------------------+
1 row in set (0.001 sec)

mysql>
