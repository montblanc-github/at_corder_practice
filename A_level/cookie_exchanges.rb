a,b,c = gets.split.map(&:to_i)
 
arr = [a,b,c]
count = 0
 
if arr.uniq.one? && arr.all?(&:even?)
	puts -1
else
  while [a,b,c].all?(&:even?)
  	a_b = a+b
    b_c = b+c
    c_a = c+a
    a = b_c/2
    b = c_a/2
    c = a_b/2
    count += 1   
  end
  puts count
end