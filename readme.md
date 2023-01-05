# SpringBoot JWT - Expense Tracker

Requirements:
 + PostgreSQL
 + Alternatively if you don't want to install PostgreSQL locally use docker with this command :
```
docker conainer run --name postgresdb -e POSTGRES_PASSWORD=admin -d -p 5432:5432 postgres
```
+ Command to copy expensetracker_db.sql inside container:
```
docker cp expensetracker_db.sql postgresdb:/
```
+ Command to access container postgresdb:
```
docker container exec -it postgresdb bash
```
+ Command to import expensetracker_db.sql:
```
psql -U postgres --file expensetracker_db.sql
```