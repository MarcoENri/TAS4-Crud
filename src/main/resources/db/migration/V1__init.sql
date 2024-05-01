CREATE TABLE IF NOT EXISTS product (
                                       product_id SERIAL PRIMARY KEY,
                                       Product_name VARCHAR(100) NOT NULL,
    quantity_in_stock INT NOT NULL,
    unit_price DECIMAL(10, 2) NOT NULL,
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

CREATE TABLE IF NOT EXISTS supplier (
                                        supplier_id SERIAL PRIMARY KEY,
                                        supplier_name VARCHAR(100) NOT NULL,
    contact_name VARCHAR(100),
    contact_title VARCHAR(100),
    address VARCHAR(255),
    city VARCHAR(100),
    region VARCHAR(100),
    postal_code VARCHAR(20),
    country VARCHAR(100),
    phone VARCHAR(20),
    email VARCHAR(100)
    );
