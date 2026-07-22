package com.cybersoft.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hrmAdminPage {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // 1: Admin menu item
        By adminMenuBy = By.xpath("//span[text()='Admin']");
        WebElement adminMenu = driver.findElement(adminMenuBy);

        // 2: PIM menu item
        By pimMenuBy = By.xpath("//span[text()='PIM']");
        WebElement pimMenu = driver.findElement(pimMenuBy);

        // 3: Leave menu item
        By leaveMenuBy = By.xpath("//span[text()='Leave']");
        WebElement leaveMenu = driver.findElement(leaveMenuBy);

        // 4: Username input field
        By usernameInputBy = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
        WebElement usernameInput = driver.findElement(usernameInputBy);

        // 5: User Role dropdown select
        By userRoleSelectBy = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
        WebElement userRoleSelect = driver.findElement(userRoleSelectBy);

        // 6: User Role option Admin
        By userRoleOptionAdminBy = By.xpath("//div[@role='option']//span[text()='Admin']");
        WebElement userRoleOptionAdmin = driver.findElement(userRoleOptionAdminBy);

        // 7: User Role option ESS
        By userRoleOptionESSBy = By.xpath("//div[@role='option']//span[text()='ESS']");
        WebElement userRoleOptionESS = driver.findElement(userRoleOptionESSBy);

        // 8: Employee Name input field
        By employeeNameInputBy = By.xpath("//div[@class='oxd-autocomplete-text-input--before']/following-sibling::input");
        WebElement employeeNameInput = driver.findElement(employeeNameInputBy);

        // 9: Reset button
        By resetButtonBy = By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--ghost']");
        WebElement resetButton = driver.findElement(resetButtonBy);

        // 10: Search button
        By searchButtonBy = By.xpath("//button[@type='submit']");
        WebElement searchButton = driver.findElement(searchButtonBy);

        // 11: User Management top nav dropdown tab
        By userManagementTabBy = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']");
        WebElement userManagementTab = driver.findElement(userManagementTabBy);

        // 12: Table row 2 - Username cell
        By row2UsernameCellBy = By.xpath("//div[@class='oxd-table-card'][2]//div[@role='cell'][2]");
        WebElement row2UsernameCell = driver.findElement(row2UsernameCellBy);

        // 13: Table row 2 - User Role cell
        By row2UserRoleCellBy = By.xpath("//div[@class='oxd-table-card'][2]//div[@role='cell'][3]");
        WebElement row2UserRoleCell = driver.findElement(row2UserRoleCellBy);

        // 14: Table row 2 - Delete action button
        By row2DeleteButtonBy = By.xpath("//div[@class='oxd-table-card'][2]//button[i[contains(@class,'bi-trash')]]");
        WebElement row2DeleteButton = driver.findElement(row2DeleteButtonBy);

        // 15: Table row 2 - Edit action button
        By row2EditButtonBy = By.xpath("//div[@class='oxd-table-card'][2]//button[i[contains(@class,'bi-pencil')]]");
        WebElement row2EditButton = driver.findElement(row2EditButtonBy);

        // 16: Table header - User Role sort column
        By headerUserRoleBy = By.xpath("//div[@role='columnheader'][contains(.,'User Role')]");
        WebElement headerUserRole = driver.findElement(headerUserRoleBy);

        // 17: Table header - Employee Name sort column
        By headerEmployeeNameBy = By.xpath("//div[@role='columnheader'][contains(.,'Employee Name')]");
        WebElement headerEmployeeName = driver.findElement(headerEmployeeNameBy);

        // 18: Header title (Admin / User Management)
        By headerTitleBy = By.xpath("//span[contains(@class,'oxd-topbar-header-breadcrumb')]");
        WebElement headerTitle = driver.findElement(headerTitleBy);

        // 19: Sidebar toggle button
        By sidebarToggleBy = By.xpath("//button[contains(@class,'oxd-main-menu-button')]");
        WebElement sidebarToggle = driver.findElement(sidebarToggleBy);

        // 20: Filter section collapse/expand toggle button
        By filterToggleBy = By.xpath("//div[contains(@class,'oxd-table-filter')]//button[contains(@class,'oxd-icon-button')]");
        WebElement filterToggle = driver.findElement(filterToggleBy);

        // 21: Add button
        By addButtonBy = By.xpath("//button[normalize-space()='Add']");
        WebElement addButton = driver.findElement(addButtonBy);
    }
}
