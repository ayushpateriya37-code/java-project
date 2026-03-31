# 📘 Usage Guide – Campus Course & Records Manager (CCRM)
by ayush pateriya
24BAI10067

This guide explains how to *set up, run, and use* the Campus Course & Records Manager (CCRM) application.

---

## 🔧 Prerequisites

Before running this project, ensure the following are installed:

- *Java SE 17+* (or any latest Java SE version)  
  Verify installation:
  ```bash
  java -version

Git (to clone the repository)

Optional: Eclipse IDE or VS Code for editing/debugging



---

▶ Setup & Run

1. Clone the Repository

https://github.com/ayushpateriya37-code/java-project/tree/main

2. Compile the Source Code

javac -d bin src/edu/ccrm/cli/MainMenu.java src/edu/ccrm/cli/CLIApp.java src/edu/ccrm/domain/*.java src/edu/ccrm/service/*.java src/edu/ccrm/io/*.java src/edu/ccrm/util/*.java src/edu/ccrm/config/*.java

3. Run the Program

java -cp bin edu.ccrm.cli.CLIApp

---

📑 CLI Menu Overview

When you run the program, you’ll see:

===== Campus Course & Records Manager =====
1. Manage Students
2. Manage Courses
3. Enrollments & Grades
4. Import/Export Data
5. Backup & Reports
6. Print Transcript
7. Exit
Enter choice:


---

🔹 Functionalities

1️⃣ Manage Students

1. Add Student
2. List Students
3. Deactivate Student
4. Back


2️⃣ Manage Courses

1. Add Course
2. List Courses
3. Back


3️⃣ Enrollments & Grades

1. Enroll Student
2. Assign Grade
3. List Enrollments
4. Back


4️⃣ 4. Import/Export Data

1. Import All Data
2. Export All Data
3. Back


5️⃣ Backup & Reports

1. Create Backup Now
2. Show Reports
3. Back


6️⃣ Print Transcript

7️⃣ Exit 

Saves all data automatically.

Creates a final backup before closing.

---
## 📂 Data & Test Files

The data/ folder contains initial CSV files which serve as *test data* for the Campus Course & Records Manager (CCRM):

- data/students.csv → initial student records  
- data/courses.csv → initial course records  
- data/enrollments.csv → initial enrollment records

When the program runs:  
- It reads data from these files to populate the system.  
- Exported data is saved in the exports/ folder.  
- Backups are created in timestamped folders inside the backups/ folder.  

---
