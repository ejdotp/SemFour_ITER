.global _start
_start:
	ldr r0, =0x10100000 //load register
	ldr r1, [r0], #4    //stores first then address+=4
	ldr r2, [r0], #4
	and r3, r1, r2      // r3 = r1 and r2
	str r3, [r0], #4
	orr r4, r1, r2
	str r4, [r0], #4
	eor r5, r1, r2
	str r5, [r0], #4
	mvn r6, r1          //not
	str r6, [r0], #4
	mvn r7, r2
	str r7, [r0]
my_exit: b my_exit
//E. Jagadeeswar Patro, 2241016309
//lab4 obj 3
//input value at memory window
//compiled using CPULator, ARM7 Version