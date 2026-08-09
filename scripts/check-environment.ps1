[CmdletBinding()]
param([switch]$Strict)

$checks = @(
    @{ Name = 'Git'; Command = 'git'; Arguments = '--version' },
    @{ Name = 'Java'; Command = 'java'; Arguments = '-version' },
    @{ Name = 'Maven'; Command = 'mvn'; Arguments = '-version' },
    @{ Name = 'Python'; Command = 'python'; Arguments = '--version' },
    @{ Name = 'Node'; Command = 'node'; Arguments = '--version' },
    @{ Name = 'pnpm'; Command = 'pnpm'; Arguments = '--version' },
    @{ Name = 'Go'; Command = 'go'; Arguments = 'version' },
    @{ Name = 'Rust'; Command = 'rustc'; Arguments = '--version' },
    @{ Name = 'Cargo'; Command = 'cargo'; Arguments = '--version' },
    @{ Name = 'C compiler'; Command = 'clang'; Arguments = '--version' }
)

$missing = [System.Collections.Generic.List[string]]::new()
Write-Host "K5 environment check: $((Get-Location).Path)"
foreach ($check in $checks) {
    $command = Get-Command $check.Command -ErrorAction SilentlyContinue
    if ($null -eq $command) {
        Write-Host ("[MISSING] {0}: {1}" -f $check.Name, $check.Command) -ForegroundColor Yellow
        $missing.Add($check.Name)
        continue
    }
    $version = & $command.Source $check.Arguments 2>&1 | Select-Object -First 1
    Write-Host ("[OK]      {0}: {1}" -f $check.Name, $version)
}

if ($missing.Count -gt 0) {
    Write-Host ("Missing: " + ($missing -join ', ')) -ForegroundColor Yellow
    if ($Strict) { exit 1 }
    Write-Host 'Use -Strict in CI or before a full K5 verification.'
}
