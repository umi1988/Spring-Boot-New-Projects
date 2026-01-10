

CREATE DATABASE IF NOT EXISTS test_schema_monolith CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Optional: Create a common application user with access to all three schemas
-- (Replace 'appuser' and 'apppass' with your values)
CREATE USER IF NOT EXISTS 'test_schema_monolith'@'%' IDENTIFIED BY 'tiger';
GRANT ALL PRIVILEGES ON test_schema_monolith.* TO 'test_schema_monolith'@'%';

-- Apply changes
FLUSH PRIVILEGES;