a,b,c = gets.split.map(&:to_i)

arr = [a,b,c]
count = 0

if arr.uniq.one? && arr.all?(&:even?)
	puts -1
else
  while arr.all?(&:even?)
    arr = arr.rotate.zip(arr.rotate(2)).map{ |i| i.sum / 2 }
    count += 1
  end
  puts count
end