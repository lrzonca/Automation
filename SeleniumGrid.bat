set seleniumGrid=C:\Users\Mirek\workspace\WebDriver\lib\selenium-2.18.0
set seleniumVersion=2.18.0
ECHO Load GitHub

cd %seleniumGrid%
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role hub
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=iexplore,platform=WINDOWS -port 4448
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=firefox,platform=WINDOWS
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=firefox,platform=WINDOWS -port 4445
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=chrome,platform=WINDOWS

ECHO Type something

PAUSE
