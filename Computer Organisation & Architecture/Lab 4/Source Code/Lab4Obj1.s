.global _start
_start:
	mov r0, #0x40
	mov r1, #0x50
	adds r2, r0, r1
	subs r3, r0, r1
	mul r4, r0, r1
my_exit: b my_exit //infinite loop terminates code
// E. Jagadeeswar Patro, 2241016309
//compiled using CPULator, ARM7 Version