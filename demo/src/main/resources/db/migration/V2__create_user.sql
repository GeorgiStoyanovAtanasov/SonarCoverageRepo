CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255),
    CONSTRAINT unique_username UNIQUE (username)
);
