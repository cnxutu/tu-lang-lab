[CmdletBinding()]
param(
    [switch]$Install,
    [switch]$IncludeTomcat,
    [string]$TomcatVersion = '11.0.24',
    [string]$TomcatHome = "$env:USERPROFILE\tools\tomcat"
)

$packages = @(
    'Git.Git',
    'Microsoft.WindowsTerminal',
    'Microsoft.VisualStudioCode',
    'EclipseAdoptium.Temurin.8.JDK',
    'EclipseAdoptium.Temurin.17.JDK',
    'EclipseAdoptium.Temurin.21.JDK',
    'EclipseAdoptium.Temurin.25.JDK',
    'Apache.Maven',
    'Python.Python.3.13',
    'OpenJS.NodeJS.LTS',
    'pnpm.pnpm',
    'GoLang.Go',
    'Rustlang.Rustup',
    'MSYS2.MSYS2'
)

function Invoke-Install([string]$id) {
    $command = "winget install --id $id -e --source winget --accept-source-agreements --accept-package-agreements"
    if ($Install) {
        Write-Host "> $command" -ForegroundColor Cyan
        & winget install --id $id -e --source winget --accept-source-agreements --accept-package-agreements
        if ($LASTEXITCODE -ne 0) {
            Write-Warning "winget failed for $id; run 'winget search --id $id' and install it manually if the package ID changed."
        }
    } else {
        Write-Host "[preview] $command"
    }
}

if ($Install -and $null -eq (Get-Command winget -ErrorAction SilentlyContinue)) {
    throw 'winget is unavailable. Install or repair Microsoft App Installer, then rerun this script.'
}

Write-Host 'K5 Windows bootstrap: package installation is preview-only unless -Install is supplied.'
foreach ($package in $packages) { Invoke-Install $package }

if ($IncludeTomcat) {
    $url = "https://dlcdn.apache.org/tomcat/tomcat-11/v$TomcatVersion/bin/apache-tomcat-$TomcatVersion-windows-x64.zip"
    $archive = Join-Path $env:TEMP "apache-tomcat-$TomcatVersion.zip"
    Write-Host "Tomcat URL: $url"
    if ($Install) {
        New-Item -ItemType Directory -Force -Path $TomcatHome | Out-Null
        Invoke-WebRequest -Uri $url -OutFile $archive
        Expand-Archive -Path $archive -DestinationPath $TomcatHome -Force
        Remove-Item -LiteralPath $archive -Force
        Write-Host "Tomcat extracted under $TomcatHome. Verify SHA-512 from https://tomcat.apache.org/download-11 before production use."
    } else {
        Write-Host "[preview] Download and extract Tomcat $TomcatVersion to $TomcatHome"
    }
}

Write-Host ''
Write-Host 'Next steps:' -ForegroundColor Green
Write-Host '1. Open a new terminal so installed PATH entries are visible.'
Write-Host '2. Run .\scripts\check-environment.ps1.'
Write-Host '3. Run .\scripts\set-java-home.ps1 -Version 17 for the K5 default JDK.'
Write-Host '4. For MSYS2 C demos, open the MSYS2 UCRT64 terminal and install mingw-w64-ucrt-x86_64-toolchain.'
