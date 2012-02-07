PUSHD .
set seleniumVersion=2.18.0
set seleniumGrid=%CD%\lib\selenium-%seleniumVersion%

ECHO Load GitHub

cd %seleniumGrid%
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role hub

echo Registering browsers
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=iexplore,platform=WINDOWS -port 4447
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=firefox,platform=WINDOWS -port 4446
START java -jar selenium-server-standalone-%seleniumVersion%.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=chrome,platform=WINDOWS -port 4448

POPD
