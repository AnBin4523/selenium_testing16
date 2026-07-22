package com.cybersoft.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonSearchResultPage {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.get("https://www.amazon.com/s?k=adidas&crid=3O39EGO9XSC79&sprefix=adidas%2Caps%2C353&ref=nb_sb_noss_1");

        // 1. Hình ảnh sản phẩm (Best Seller)
        By productImage1 = By.xpath("//img[contains(@alt, \"adidas Unisex-Adult Samba Indoor Shoe\")]");
        WebElement productImage1Element = driver.findElement(productImage1);

        // 2. Giá List Price
        By listPrice = By.xpath("//span[normalize-space()='List:']");
        WebElement listPriceElement = driver.findElement(listPrice);

        // 3. Giá bán chính
        By currentPrice = By.xpath("//span[normalize-space()='VND']");
        WebElement currentPriceElement = driver.findElement(currentPrice);

        // 4. Ô nhập tìm kiếm (Search Box với từ khóa "adidas")
        By searchInput = By.xpath("//input[@id='twotabsearchtextbox']");
        WebElement searchInputElement = driver.findElement(searchInput);

        // 5. Nút Giỏ hàng (Cart Header)
        By cartBtn = By.xpath("//a[@id='nav-cart']");
        WebElement cartBtnElement = driver.findElement(cartBtn);

        // 6. Tên/Tiêu đề sản phẩm
        By productTitle8 = By.xpath("//h2//span[contains(text(),\"Men's Samba Classic Indoor Soccer Shoes\")]");
        WebElement productTitle8Element = driver.findElement(productTitle8);

        // 7. Thông tin ngày giao hàng
        By deliveryDate = By.xpath("//span[normalize-space()='Fri, Aug 7']");
        WebElement deliveryDateElement = driver.findElement(deliveryDate);

        // 8. Tên thương hiệu "adidas"
        By brandNameInCard = By.xpath("//span[normalize-space()='adidas']");
        WebElement brandNameInCardElement = driver.findElement(brandNameInCard);

        // 9. Checkbox lọc giới tính "Men"
        By genderMenCheckbox = By.xpath("//i[@class='a-icon a-icon-checkbox']");
        WebElement genderMenCheckboxElement = driver.findElement(genderMenCheckbox);

        // 10. Dòng thông báo số lượng kết quả tìm kiếm
        By resultStatsText = By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']");
        WebElement resultStatsTextElement = driver.findElement(resultStatsText);
    }
}
