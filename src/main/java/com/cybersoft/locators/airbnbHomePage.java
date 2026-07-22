package com.cybersoft.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class airbnbHomePage {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.get("https://demo5.cybersoft.edu.vn/?fbclid=IwY2xjawTNTH9leHRuA2FlbQIxMQBzcnRjBmFwcF9pZAEwAAEeTeoxxZERTNwP8B619G3oRmCMS3eMRG0mqWoD6PitqaHem13GD69mB1uzSJM_aem_VejWZWbDcSeEM_J7DO1ZEw");

        // 1. Logo Airbnb (Header)
        By logoHeader = By.xpath("//span[@class='self-center text-2xl font-semi font-bold whitespace-nowrap  text-[#FE6B6E] duration-500 hover:text-rose-600']");
        WebElement logoHeaderElement = driver.findElement(logoHeader);

        // 2. Menu Home
        By menuHome = By.xpath("//a[normalize-space()='Home']");
        WebElement menuHomeElement = driver.findElement(menuHome);

        // 3. Menu About
        By menuAbout = By.xpath("//a[normalize-space()='About']");
        WebElement menuAboutElement = driver.findElement(menuAbout);

        // 4. Icon/Nút User Profile (Góc trên bên phải)
        By userProfileBtn = By.xpath("//button//img[@class='h-10']");
        WebElement userProfileBtnElement = driver.findElement(userProfileBtn);

        // 5. Ô nhập Địa điểm ("Bạn sắp đi đâu?")
        By locationInput = By.xpath("//p[@class='text-sm text-gray-400']");
        WebElement locationInputElement = driver.findElement(locationInput);

        // 6. Ô chọn Ngày ("23/07/2026 – 30/07/2026")
        By datePicker = By.xpath("//p[normalize-space()='23/07/2026 – 30/07/2026']");
        WebElement datePickerElement = driver.findElement(datePicker);

        // 7. Ô/Nút Thêm khách & Tìm kiếm
        By addGuestBtn = By.xpath("//p[normalize-space()='Thêm khách']");
        WebElement addGuestBtnElement = driver.findElement(addGuestBtn);

        // 8. Nút Tăng số lượng khách (+)
        By increaseGuestBtn = By.xpath("//div[normalize-space()='+']");
        WebElement increaseGuestBtnElement = driver.findElement(increaseGuestBtn);

        // 9. Nút Giảm số lượng khách (-)
        By decreaseGuestBtn = By.xpath("//div[normalize-space()='-']");
        WebElement decreaseGuestBtnElement = driver.findElement(decreaseGuestBtn);

        // 10. Card vị trí "Hồ Chí Minh"
        By locationHCM = By.xpath("//div[@class='ant-card ant-card-bordered ant-card-hoverable w-full flex items-center cursor-pointer hover:bg-gray-100 hover:scale-105 transition duration-300 ease-in-out css-zl9ks2']");
        WebElement locationHCMElement = driver.findElement(locationHCM);

        // 11. Tên địa điểm "Cần Thơ"
        By locationCanThoText = By.xpath("//h2[normalize-space()='Cần Thơ']");
        WebElement locationCanThoTextElement = driver.findElement(locationCanThoText);

        // 12. Bộ lọc "Loại nơi ở"
        By filterRoomType = By.xpath("//button[normalize-space()='Loại nơi ở']");
        WebElement filterRoomTypeElement = driver.findElement(filterRoomType);

        // 13. Bộ lọc "Giá"
        By filterPrice = By.xpath("//button[normalize-space()='Giá']");
        WebElement filterPriceElement = driver.findElement(filterPrice);

        // 14. Text thời gian di chuyển "6.5 giờ lái xe" (Nha Trang)
        By driveTimeNhaTrang = By.xpath("//p[normalize-space()='6.5 giờ lái xe']");
        WebElement driveTimeNhaTrangElement = driver.findElement(driveTimeNhaTrang);
    }
}
