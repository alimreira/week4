CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    address VARCHAR(255),
    phone_number VARCHAR(15),
    gender VARCHAR(10),
    enrollment_date DATE NOT NULL,
    is_active BOOLEAN NOT NULL
);