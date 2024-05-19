.global _start
_start:
	@Largest number from a given array
	ldr r0, =count
	ldr r1, [r0]
	mov r4, #0x00
	ldr r2, =array
back: ldr r3, [r2], #4
	cmp r4, r3 
	bgt fwd //signed integer comparision gave greater than
	mov r4, r3
fwd: subs r1, r1, #01
	bne back //comparision not equal or non zero result
	str r4, [r2]
exit: b exit

.data
count: .word 0x05
array: .word 0x15, 0x35, 0x45, 0x10, 0x4f
	