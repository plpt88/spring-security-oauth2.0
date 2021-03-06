--------------- H2 ---------------
create table transfers (
  unique_id VARCHAR(255) PRIMARY KEY,
  transaction_id VARCHAR(255),
  usage VARCHAR(255),
  amount REAL(10),
  currency VARCHAR(255),
  status VARCHAR(255),
  funding_method_id INT(10),
  return_success_url VARCHAR(255),
  return_failure_url VARCHAR(255),
  date DATETIME
);

create table funding_methods (
  id VARCHAR(255) PRIMARY KEY,
  status VARCHAR(255),
  type VARCHAR(255),
  bin VARCHAR(255),
  tail VARCHAR(255),
  expiration_date DATETIME
);

create table fees (
    id VARCHAR(255) PRIMARY KEY,
    fixed_amount REAL(10),
    percentage REAL(10),
    category VARCHAR(255)
)