@echo OFF 
SETLOCAL ENABLEDELAYEDEXPANSION 
set /p id=Enter dir: 
cd %id%
for /r %%x in (*.java) do (CHOICE /c YN /m "Ada file Java pada direktori "%%x", mau diganti namanya?" & if !errorlevel!==1 set /p a=Enter name: & ren %%x !a!.java )
pause