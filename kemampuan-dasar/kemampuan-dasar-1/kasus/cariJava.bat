@echo OFF
set /p id=Enter dir: 
cd %id%
for /r %%x in (*.java) do echo Ada file Java pada direktori "%%x"
pause