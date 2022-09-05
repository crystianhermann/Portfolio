import time
import pytest
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

@pytest.fixture()
def test_setup():
    global driver
    global url
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    url = "http://demowebshop.tricentis.com/"
    driver.implicitly_wait(5)
    driver.maximize_window()
    yield
    time.sleep(5)
    driver.quit()
    print('Test Completed')


def test_login(test_setup):
    driver.get(url)
    driver.find_element('xpath', '/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a').click()
    driver.find_element('xpath', '//*[@id="Email"]').send_keys('teste123abc@gmail.com')
    driver.find_element('xpath', '//*[@id="Password"]').send_keys('teste123')
    driver.find_element('xpath', '/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input').click()
    x = driver.title
    assert x == 'Demo Web Shop'

#POSTCONDITION
# def test_teardown():
#     time.sleep(5)
#     driver.quit()
#     print('Test Completed')