Clear-Host

Add-Type -AssemblyName System.Windows.Forms

Echo "Keep-alive with Scroll Lock..."
Echo "ruszam kursor..."

$WShell = New-Object -com "Wscript.Shell"
$PlusOrMinus = 1

while ($true)
{
  $Pos = [System.Windows.Forms.Cursor]::Position
  $x = ($pos.X % 500) + 1
  $y = ($pos.Y % 500) + 1
  [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point($x, $y)
  Start-Sleep -Seconds 10
  
  $WShell.sendkeys("{SCROLLLOCK}")
  Start-Sleep -Miliseconds 100
  $WShell.sendkeys("{SCROLLLOCK}")

  Start-Sleep -Seconds 10

}
::uruchom jako admin PowerShell(ze starta wpisz), 
::wpisz w terminal 'Set-ExecutionPolicy Undefined', ta komenda pozwala uruchamiac skrypty w win
