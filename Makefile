compile :
	javac src/academic/model/*.java src/academic/driver/*.java -d bin

test :
	cd bin && java academic.driver.Driver

