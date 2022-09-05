import time
import pytest
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

#Validação de campo obrigatório!

@pytest.fixture()
def test_setup():
    global driver
    global url
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    url = "https://www.lojacorpoperfeito.net.br/"
    driver.implicitly_wait(5)
    driver.maximize_window()
    yield
    time.sleep(5)
    driver.quit()
    print('Test Completed')

def test_cadastro_falho(test_setup):
    driver.get(url)
    driver.find_element(By.XPATH,"//a[normalize-space()='CADASTRAR-SE']").click()
    driver.find_element(By.XPATH,"//input[@name='nome-completo']").send_keys('sr teste')
    driver.find_element(By.XPATH,"//input[@name='email-cadastro']").send_keys('emailparatesteaut@gmail.com')
    driver.find_element(By.XPATH,"//input[@name='cpf-cadastro']").send_keys('08645781223')
    driver.find_element(By.XPATH,"//select[@id='ContentPlaceHolder1_ddlDiaCadastro']").send_keys('05')
    driver.find_element(By.XPATH,"//select[@id='ContentPlaceHolder1_ddlMesCadastro']").send_keys('06')
    driver.find_element(By.XPATH,"//select[@id='ContentPlaceHolder1_ddlAnoCadastro']").send_keys('1994')
    driver.find_element(By.XPATH,"//input[@name='ddd']").send_keys('081')
    driver.find_element(By.XPATH,"//div[@class='grupo-form grupo-tel']//input[@name='telefone']").send_keys(81999212728)
    driver.find_element(By.XPATH,"/html[1]/body[1]/form[1]/div[3]/div[1]/div[3]/div[2]/div[8]/input[1]").send_keys('senhaImpo123')
    driver.find_element(By.XPATH,"/html[1]/body[1]/form[1]/div[3]/div[1]/div[3]/div[2]/div[9]/input[1]").send_keys('senhaImpo123')
    driver.find_element(By.XPATH,"//button[@class='bt-entrar-black']//strong[contains(text(),'Entrar')]").click()

    buscar_campo_invalido = driver.find_element(By.XPATH,'//*[@id="form1"]/div[3]/div/div[3]/div[2]/div[4]/p')
    assert('O campo CPF é inválido', buscar_campo_invalido)




