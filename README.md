# 💰 Expense Tracker Dashboard

A modern **Expense Tracker** web application built with **Spring Boot, Thymeleaf, Bootstrap 5, and Chart.js**.  
This app allows users to **add, edit, delete, and visualize expenses** in a clean, dashboard-style interface.

---

## 📝 Features

### 1. Dashboard Summary
- Total expenses
- Number of expense entries
- Highest expense
- Average expense

### 2. Expense Management
- Add new expenses (amount, date, category, note)
- Edit existing expenses
- Delete expenses
- Validation for required fields

### 3. Data Visualization
- Pie chart of expenses by category using **Chart.js**
- Responsive design for desktop and mobile

### 4. Modern UI
- Bootstrap 5 cards and buttons
- Hover effects and colored badges
- Clean and professional dashboard layout

---

## 🛠️ Technologies Used

- **Backend:** Spring Boot  
- **Frontend:** Thymeleaf templates  
- **Styling:** Bootstrap 5, Bootstrap Icons  
- **Charts:** Chart.js  
- **Database:** H2 / MySQL / any Spring Boot-supported DB (configurable)  
- **Build Tool:** Maven  

---

## 📂 Project Structure
```bash
expense-tracker/
├── src/main/java/com/example/expensetracker
│ ├── controller/
│ │ └── ExpenseController.java
│ ├── model/
│ │ └── Expense.java
│ └── repository/
│ └── ExpenseRepository.java
├── src/main/resources/templates/
│ └── index.html
├── src/main/resources/static/
│ └── (CSS, JS, icons)
├── src/main/resources/application.properties
└── pom.xml
```

---

## ⚡ Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/yourusername/expense-tracker.git
cd expense-tracker
```

### 2. Build and Run
Use the following command to start the Spring Boot application:

```bash
mvn spring-boot:run

```

### 3. Access the application
Open your browser and navigate to:
```bash
http://localhost:8080/
```

### 4. Optional: Configure Database
By default, H2 in-memory database is used.
To use MySQL or another database, update application.properties:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/expense_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

```

### 🎨 Screenshots
### 💰 Expense Tracker Dashboard

![Expense Tracker UI](https://github.com/vivekram17/ExpensesTracker/blob/master/src/main/resources/assets/Screenshot%202025-10-05%20093444.png?raw=true)

### Adding an Expense

![Expense Adding](https://github.com/vivekram17/ExpensesTracker/blob/master/src/main/resources/assets/Screenshot%202025-10-05%20093557.png?raw=true)


### Expense Table

![Expense Table UI](https://github.com/vivekram17/ExpensesTracker/blob/master/src/main/resources/assets/Screenshot%202025-10-05%20093616.png?raw=true)


