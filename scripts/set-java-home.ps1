[CmdletBinding()]
param(
    [Parameter(Mandatory = $true)]
    [ValidateSet('8', '17', '21', '25')]
    [string]$Version
)

$roots = @(
    'C:\Program Files\Eclipse Adoptium',
    'C:\Program Files\Java',
    'C:\Program Files\Microsoft'
)
$candidate = Get-ChildItem -Path $roots -Directory -ErrorAction SilentlyContinue |
    Where-Object { $_.Name -match "(^|[^0-9])$Version([^0-9]|$)" } |
    Sort-Object FullName -Descending |
    Select-Object -First 1

if ($null -eq $candidate) {
    throw "JDK $Version was not found. Install a JDK first or edit the search roots in this script."
}

$env:JAVA_HOME = $candidate.FullName
$env:Path = "$($candidate.FullName)\bin;" + (($env:Path -split ';' | Where-Object { $_ -notmatch 'Java|jdk' }) -join ';')
Write-Host "JAVA_HOME=$env:JAVA_HOME"
java -version
