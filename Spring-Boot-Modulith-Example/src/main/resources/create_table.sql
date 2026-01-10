

CREATE TABLE parking_entry (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    vehicleNumber VARCHAR(20) NOT NULL,
    entryTime DATETIME NOT NULL,
    exitTime DATETIME,
    active BOOLEAN NOT NULL DEFAULT TRUE
);



CREATE TABLE slot (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    slotCode VARCHAR(10) NOT NULL UNIQUE,
    available BOOLEAN NOT NULL DEFAULT TRUE,
    vehicleNumber VARCHAR(20)
);


INSERT INTO slot (slotCode, available, vehicleNumber) VALUES
    ('A1', TRUE, NULL),
    ('A2', TRUE, NULL),
    ('A3', TRUE, NULL);



CREATE TABLE billing_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    vehicleNumber VARCHAR(20) NOT NULL,
    amount DOUBLE NOT NULL,
    billingTime DATETIME NOT NULL
);