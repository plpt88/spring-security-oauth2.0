--------------- H2 ---------------
create table transfers (
  unique_id VARCHAR(255) PRIMARY KEY,
  transaction_id VARCHAR(255),
  usage VARCHAR(255),
  amount DECIMAL(255),
  currency VARCHAR(255),
  source_wallet_id VARCHAR(255),
  return_success_url VARCHAR(255),
  return_failure_url INTEGER,
  status VARCHAR(255),
  date DATETIME
);