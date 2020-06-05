
CREATE TABLE FormPizza (
	FormPizza_ID INT AUTO_INCREMENT,
	Name VARCHAR(100),		
	Last_Name VARCHAR(100),		
	Street VARCHAR(100),		
	PRIMARY KEY(FormPizza_ID)
);

CREATE TABLE SatisfactionForm (
	SatisfactionForm_ID INT AUTO_INCREMENT,
	Delivery VARCHAR(100),		
	Name VARCHAR(100),		
	Opinion VARCHAR(100),		
	Satisfaction INT,
	PRIMARY KEY(SatisfactionForm_ID)
);

CREATE TABLE ChoosePizza (
	ChoosePizza_ID INT AUTO_INCREMENT,
	Pizza_Pepperoni BOOLEAN,
	Pizza_Hawai BOOLEAN,
	Pizza_Margarita BOOLEAN,
	PRIMARY KEY(ChoosePizza_ID)
);

CREATE TABLE PizzaStatus (
	PizzaStatus_ID INT AUTO_INCREMENT,
	Name VARCHAR(100),		
	Last_Name VARCHAR(100),		
	Street VARCHAR(100),		
	PRIMARY KEY(PizzaStatus_ID)
);

CREATE TABLE SatisfCheck (
	SatisfCheck_ID INT AUTO_INCREMENT,
	CheckSatisfaction VARCHAR(100),		
	Annotations VARCHAR(100),		
	PRIMARY KEY(SatisfCheck_ID)
);
