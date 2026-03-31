# 📄 Resume Keyword Optimizer (ATS Checker)

## 🚀 Overview

The **Resume Keyword Optimizer** is a Java-based application that analyzes a resume against a job description to evaluate how well it matches Applicant Tracking System (ATS) requirements.

It helps users identify missing keywords, understand their ATS compatibility, and improve their chances of getting shortlisted for interviews.

---

## ❓ Problem

Many job applicants get rejected during the initial screening process because their resumes do not match the keywords expected by Applicant Tracking Systems (ATS).

Even qualified candidates may fail to pass this stage due to:

* Lack of keyword optimization
* Generic resumes
* No feedback on missing skills

---

## 💡 Solution

This project compares a resume with a job description and provides:

* ✅ ATS Match Score (%)
* ✅ Matched Keywords
* ❌ Missing Keywords

It uses text processing and keyword extraction techniques to simulate how ATS systems filter resumes.

---

## ⚙️ Features

* 📂 File-based input (resume.txt & job.txt)
* 🧹 Text cleaning and preprocessing
* 🔍 Keyword extraction with stopword removal
* 📊 ATS score calculation
* 📌 Identification of missing keywords
* 🧠 Modular and object-oriented design

---

## 🛠️ Tech Stack

* **Language:** Java
* **Concepts Used:**

  * Object-Oriented Programming (OOP)
  * File Handling
  * Collections Framework (HashSet)
  * String Processing

---

## 📁 Project Structure

```
ResumeOptimizer/
│
├── src/
│       ├── Main.java
│       ├── analyzer/
│       │   ├── ATSMatcher.java
│       │   └── KeywordExtractor.java
│       ├── utils/
│       │   ├── TextCleaner.java
│       │   └── FileHandler.java
│       └── model/
│           └── AnalysisResult.java
│
├── data/
│   ├── resume.txt
│   └── job.txt
│
├── README.md
└── report.pdf
```

---

## ▶️ How to Run

### 🔧 Step 1: Clone the Repository

```
git clone https://github.com/devanshk4/Resume-Keyword-Optimizer
cd resume-keyword-optimizer
```

### 📝 Step 2: Add Input Files

Create/edit files in the `data/` folder:

**resume.txt**

```
Java developer with experience in Spring Boot and SQL.
```

**job.txt**

```
Looking for Java developer with Spring Boot, SQL, REST API, Microservices.
```

---

### ▶️ Step 3: Compile & Run

```
javac -d . src/*.java
java Main
```

---

## 📊 Sample Output

```
ATS Score: 66.6%

Matched Keywords:
[java, spring, boot, sql, rest, api]

Missing Keywords:
[microservices]
```

---

## 🧠 How It Works

1. Reads resume and job description from files
2. Cleans text (removes punctuation, converts to lowercase)
3. Extracts keywords (removes stopwords)
4. Compares keywords using set operations
5. Calculates ATS match score

---

## ⚠️ Limitations

* No semantic understanding (exact keyword matching only)
* Does not detect synonyms
* Console-based interface

---

## 🔮 Future Improvements

* Add GUI using Java Swing
* Support PDF/DOC resume parsing
* Implement NLP for smarter keyword detection
* Add weighted scoring system

---

## 👨‍💻 Author

**Devansh Kaushik**

---

## 📌 Note


---
