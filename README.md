The case study below is a combination of several case studies on programming assignments by my lecturer, which I then redefined into a recent case study.

# Academic Stats
Butet had just met with one of the programming lecturers who asked her to develop a simple program to simulate entities in the academic world. The lecturer had developed the basic design of the Simulator, and Butet was only asked to implement it. 

## Let's get started
As a first step, the simulator will only deal with a few entities whose definition is clear, namely courses (```course```), students (```student```), and enrollments (```enrollment```).

Here are the details of the entities in the simulator:
1. A ```course``` has a course code (```code``` ), the name of the course (```name```), credit (```credit```), and minimum grade (```passing grade```). The credit score rule is ```0 < credit < = 8```.
2. A ```student``` has a student's id (```id```), the student's name (```name```), the entrance year (```year```), and the study program (```study program```).
3. An ```enrollment``` is the relationship between ```course``` and ```student```. A ```course``` can be contracted by many ```students``` and a ```student``` can contract many ```courses```. An ```enrollment``` is tied to a ```semester``` in an academic year (```academic year```). An ```enrollment``` has a ```course```, ```student```, ```academic year```, ```semester```, and the grades obtained by the student concerned (```grade```).
4. There are three semesters, odd (```odd```), even (```even```), and short (```short```).
5. There are eight letter grade options (```grade```): ```A```, ```AB```, ```B```, ```BC```, ```C```, ```D```, ```E```,```T```. In anticipation of a situation where a value has not been entered, then by default is set with ```None```. For each letter grade can be converted to the number value. ```4.0``` for the letter grade ```A```, ```3.5``` for the letter grade ```AB```, ```3.0``` for the letter grade ```B```,', ```2.5``` for the letter grade ```BC```, ```2.0``` for the letter grade ```C```, ``` 1.0``` for the letter grade ```D```, and ```0.0``` for the letter grade ```E```. For the grade of the letter ```T``` and when the value has not been given (```None```) it will be given the value of the number ```0.0```.

After knowing the details of the entities in the Simulator, Butet was given some small tasks that would later form into academic statistics.
Here are the details of the small tasks that Butet must done.

## Task 01: Refining The Empty Class 
The first step that Butet must do is to complete the definition of the following three classes:
1. ```academic.model.Course``` which represents the entity ```course```.
2. ```academic.model.Student``` which represents the entity ```student```.
3. ```academic.model.Enrollment``` which represents the entity ```enrollment```.

## Task 02: Add More 
In this task Butet was asked to develop a driver (```academic.driver.Driver```) capable of simulating multiple storage capabilities on all entities (```academic.model.Course```), (```academic.model.Student```), and (```academic.model.Enrollment```). Butet is directed to use arrays as storage media. Furthermore, driver must also have the ability to receive interactive input lines from users. Each input line represents the data of an entity. An input line consists of 5 segments matched with ```#```. The last four segments represent the data needed to form a course. To distinguish the instructions for each entity, a segment is added at the beginning of the input with the following specifications:
1. ```course-add``` is intended to add an entity ```academic.model.Course```.
2. ```student-add``` is intended to add an entity ```academic.model.Student```.
3. ```enrollment-add``` is intended to add an entity ```academic.model.Enrollment```.

The driver will constantly read the input line at the execution time until it is commanded to stop. The stop command is marked with ```---```.

## Task 03: When Things Go Wrong 
An ```enrollment``` can only be done when the ```course``` and ```student``` involved have been first registered. If it has not been registered, then the ```enrollment``` attempt  must be canceled because the ```course``` or ```student``` involved **does not exist**. In this task, Butet was asked to develop a mechanism for handling exceptions during the invalid ```course``` or ```student```. Butet must write down the solution of this task on ```academic.driver.Driver```.

An examination of the validity is first carried out on the ```course``` then ```student```.

## Task 04: Additional Entity 
In this task, Butet was asked to add a new entity to the simulator that represented the lecturer (```lecturer```). A lecturer can be described by NIDN (```id```'), lecturer's name (```name```), initials (```initial```), email address (```email```), and study program (```study program```). A lecturer is only enrolled in exactly one study program (```study program```).

Butet had to develop a driver (```academic.driver.Driver```), which is a continuation of **Task 03: When things go wrong**. In addition to the features that have been developed in **Task 03: When things go wrong**, Butet must also equip driver with features to register lecturer entities. The command used is marked with a token ```lecturer-add``` followed by several data segments. Keep in mind that a lecturer is identified from his NIDN. Each lecturer also has a unique initial and email. 
At the end of the execution, the driver will display the lecturer entities that have been registered. The list of lecturers is displayed before the solution displays the list of courses. 

## Task 04: Updating Related Entities 
In this task, Butet was asked to make a solution modification to the course entity (```course```) by adding information to the lecturer. At least one lecturer occupies a course without maximum restrictions.
To meet these requirements, it is necessary to adapt to the entered format to register a course by adding an additional segment, a list of lecturers (```lecturer-initial-list```).
In the course being taught by more than one lecturer, the lecturer's initials are written with a comma (```,```) as a separator. 
The addition of the lecturer information also affects the external format. The data of a lecturer is displayed in initials and email addresses. A semicolon (```;```') is written as a separator in this situation. 

## Task 05: Grading (academic.driverDriver1, 40pts)
In completing this task, Butet is allowed to define other classes if needed.
In this task, Butet was asked to develop a feature that allows users to set the grades (```grade```) obtained by a student in a course. The given values are the values of letters, namely ```A```, ```AB```, ```B```, ```BC```, ```C```, ```D```, and ```E```.
To set a value, the user will enter a line of commands with the following format.

```bash
enrollment-grade#<course-code>#<student-id>#<academic-year>#<semester>#<grade>
```

The input line consists of 6 segments matched with the hash sign (```#```). The first segment is the command given and followed by a series of data related to the enrollment (```enrollment```) and the given value (```grade```). The Simulator will then first look for the appropriate enrollment (```enrollment```) if it is found that an update is made to the value of the enrollment. If not, the command is ignored, and the solution goes to the next command. There is no output after the Simulator has finished working on this command.

## Task 06: Student's GPA 
In this task, Butet was asked to develop a feature that would display complete information about a student and his academic performance. Academic performance is represented in a Cumulative Achievement Index, known as Grade Point Average (GPA). The mechanism for calculating GPA can be seen in the Academic Manual. GPA is written in 2 digits of precision value.
The user will provide an input line with the following format to run this feature.

```bash
student-details#<student-id>
```

The input line consists of 2 segments matched with the hash sign (```#```). The first segment is a command given and followed by student id (```student-id```). If the student id has not been saved in the Simulator, then the command will ignored, and the Simulator forwards to the next input line. Conversely, if the student with the identity is stored in the Simulator, the Simulator will display detailed information about the student concerned and his academic performance. Here is the output format.

```bash
<student-id>|<name>|<year>|<study-program>|<gpa>|<total-credit>
```

## Task 07: Applying Inheritance 
Butet was asked to analyze his previous work to look for aspects where what could potentially apply inheritance in this task. Butet can apply both top-down and bottom-up approaches to find that potential.
After discovering the possibility of applying inheritance, Butet had to realize his idea by refactoring the codebase that what had created before.

## Task 08: Student's GPA 
In this task, Butet was asked to revisit the previous solution so that it could handle the case of repeated courses. For example, a student has taken a course (e.g., Database) in two different semesters. The first take gets a BC grade, and the next gets an A. Referring to academic rules, the grade to be recognized is the last. Thus, the calculation of academic performance will also use the last grade. 

Here is an example of input and output for the tasks above.

**Input**

```bash
lecturer-add#0130058501#Parmonangan Rotua Togatorop#PAT#mona.togatorop@del.ac.id#Information Systems
lecturer-add#0114129002#Iustisia Natalia Simbolon#IUS#iustisia.simbolon@del.ac.id#Informatics
lecturer-add#0124108201#Rosni Lumbantoruan#RSL#rosni@del.ac.id#Information Systems
course-add#12S1101#Basic Information System#3#D#IUS
course-add#12S2102#Basisdata#4#C#PAT,IUS,RSL
student-add#12S20001#Marcelino Manalu#2020#Information Systems
student-add#12S20002#Yoga Sihombing#2020#Information Systems
student-add#12S20003#Marcel Simanjuntak#2020#Information Systems
enrollment-add#12S1101#12S20001#2020/2021#odd
enrollment-add#12S1101#12S20002#2020/2021#odd
enrollment-add#12S1101#12S20003#2020/2021#odd
enrollment-grade#12S1101#12S20001#2020/2021#odd#B
enrollment-grade#12S1101#12S20002#2020/2021#odd#B
enrollment-grade#12S1101#12S20003#2020/2021#odd#B
enrollment-add#12S2102#12S20001#2021/2022#odd
enrollment-add#12S2102#12S20002#2021/2022#odd
enrollment-add#12S2102#12S20003#2021/2022#odd
enrollment-grade#12S2102#12S20001#2021/2022#odd#B
enrollment-grade#12S2102#12S20002#2021/2022#odd#AB
enrollment-grade#12S2102#12S20003#2021/2022#odd#BC
enrollment-add#12S2102#12S20003#2022/2023#odd
enrollment-grade#12S2102#12S20003#2022/2023#odd#AB
student-details#12S20001
student-details#12S20002
student-details#12S20003
---
```

**Output**

```bash
12S20001| Marcelino Manalu| 2020| Information Systems| 3.00| 7
12S20002| Sihombing Yoga| 2020| Information Systems| 3.29| 7
12S20003| Marcel Simanjuntak| 2020| Information Systems| 3.29| 7
0130058501| Parmonangan Rotua Togatorop| PAT| mona.togatorop@del.ac.id| Information Systems
0114129002| Iustisia Natalia Simbolon| IUS| iustisia.simbolon@del.ac.id| Informatics
0124108201| Rosni Lumbantoruan| RSL| rosni@del.ac.id| Information Systems
12S1101| Basic Information Systems| 3| D| IUS (iustisia.simbolon@del.ac.id)
12S2102| Database| 4| C| PAT (mona.togatorop@del.ac.id); IUS (iustisia.simbolon@del.ac.id); RSL (rosni@del.ac.id)
12S20001| Marcelino Manalu| 2020| Information Systems
12S20002| Sihombing Yoga| 2020| Information Systems
12S20003| Marcel Simanjuntak| 2020| Information Systems
12S1101| 12S20001| 2020/2021| odd| B
12S1101| 12S20002| 2020/2021| odd| B
12S1101| 12S20003| 2020/2021| odd| B
12S2102| 12S20001| 2021/2022| odd| B
12S2102| 12S20002| 2021/2022| odd| AB
12S2102| 12S20003| 2021/2022| odd| BC
12S2102| 12S20003| 2022/2023| odd| AB
```
