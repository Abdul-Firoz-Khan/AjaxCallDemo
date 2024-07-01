

```markdown
# AjaxCallDemo

This project demonstrates how to use Selenium WebDriver with Java to interact with a web page. It specifically shows how to handle AJAX calls and wait for elements to become visible before interacting with them.

## Prerequisites

1. Java JDK 8 or higher
2. Maven
3. An IDE (such as IntelliJ IDEA or Eclipse)
4. Firefox browser
5. Git

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/Abdul-Firoz-Khan/AjaxCallDemo.git
    ```
2. Navigate to the project directory:
    ```bash
    cd AjaxCallDemo
    ```
3. Open the project in your preferred IDE.

## Running the Test

1. Ensure you have Firefox installed on your system.
2. Run the `main` method in the `AjaxCallDemo` class.

## Code Explanation

### Package and Imports

```java
package com.afk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
```

- **Package Declaration**: The package name is `com.afk`.
- **Imports**: The necessary classes from Selenium WebDriver, WebDriverManager, and Java libraries are imported.

### Main Class and Method

```java
public class AjaxCallDemo {
    public static void main(String[] args) throws InterruptedException {
        // Step 1: Setup WebDriver using WebDriverManager for Firefox
        WebDriverManager.firefoxdriver().setup();
        
        // Step 2: Initialize the Firefox WebDriver
        WebDriver driver = new FirefoxDriver();
        
        // Step 3: Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();
        
        try {
            // Step 4: Navigate to the specified URL
            driver.get("http://omayo.blogspot.com/");
            
            // Step 5: Locate the dropdown button using XPath and click it to reveal the dropdown menu
            driver.findElement(By.xpath("//button[normalize-space()='Dropdown']")).click();
            
            // Step 6: Initialize WebDriverWait with a timeout of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            // Step 7: Wait until the Facebook link is visible in the dropdown menu
            WebElement elementFacebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Facebook']")));
            
            // Step 8: Click the Facebook link once it is visible
            elementFacebook.click();
        } finally {
            // Step 9: Introduce a 2-second delay for demonstration purposes
            Thread.sleep(2000);
            
            // Step 10: Close the browser and quit the WebDriver
            driver.quit();
        }
    }
}
```

### Step-by-Step Description:

1. **Setup WebDriver**: The WebDriverManager is used to set up the Firefox driver.
2. **Initialize WebDriver**: A new instance of the Firefox WebDriver is created.
3. **Maximize Window**: The browser window is maximized.
4. **Navigate to URL**: The WebDriver navigates to the specified URL.
5. **Click Dropdown Button**: The dropdown button is located and clicked to reveal additional options.
6. **Initialize WebDriverWait**: A `WebDriverWait` object is created with a timeout of 10 seconds.
7. **Wait for Element**: The WebDriver waits until the Facebook link is visible.
8. **Click Facebook Link**: The Facebook link is clicked once it is visible.
9. **Delay**: A 2-second delay is introduced for demonstration purposes.
10. **Quit WebDriver**: The browser is closed and the WebDriver is quit.

## Additional Information

- This project uses WebDriverManager to manage the browser driver binaries automatically.
- The `Thread.sleep` calls are used to introduce delays for demonstration purposes. In a real-world scenario, you should rely on WebDriverWait or other synchronization methods.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

This `README.md` file provides a comprehensive overview of the project, including prerequisites, installation instructions, running instructions, and a detailed explanation of the code. Feel free to adjust any part of this `README.md` file according to your preferences or additional project details.
