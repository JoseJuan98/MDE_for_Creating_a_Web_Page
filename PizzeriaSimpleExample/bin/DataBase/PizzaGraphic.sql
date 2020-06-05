
CREATE TABLE PizzaForm (
	PizzaForm_ID INT AUTO_INCREMENT,
	Name VARCHAR(100),		
	Quantity INT,
	Street VARCHAR(100),		
	Pizza_Pepperoni BOOLEAN,
	Pizza_Hawai BOOLEAN,
	Pizza_Margarita BOOLEAN,
	PRIMARY KEY(PizzaForm_ID)
);

CREATE TABLE Satisfaction (
	Satisfaction_ID INT AUTO_INCREMENT,
	Satisfaction INT,
	Opinion VARCHAR(100),		
	PRIMARY KEY(Satisfaction_ID)
);

CREATE TABLE StateDelivery (
	StateDelivery_ID INT AUTO_INCREMENT,
	Status VARCHAR(100),		
	Price INT,
	DeliverID VARCHAR(100),		
	PRIMARY KEY(StateDelivery_ID)
);
