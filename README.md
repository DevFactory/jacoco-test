# jacoco-test
Simple project on ant to reproduce jacoco/powermock incompatibility. Issue #564

1. ant should contain jacocoant.jar in its lib directory.
2. Run `ant report`.
3. Look at a report in report/index.html - zero coverage.
4. replace powermock-mockito-1.6.2-full.jar with patched version.
5. repeat steps 2,3.
