--- 创建canal用户，由dba指定密码
CREATE USER canal IDENTIFIED BY 'canal';    

--  这里是给canal 授权为可以复制log的用户
GRANT SELECT, REPLICATION SLAVE, REPLICATION CLIENT ON *.* TO 'canal'@'%';
GRANT SELECT, REPLICATION SLAVE, REPLICATION CLIENT ON *.* TO 'canal'@'%';

FLUSH PRIVILEGES; 