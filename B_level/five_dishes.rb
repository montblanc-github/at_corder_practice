a = 5.times.map{gets.to_i}
b = a.map{|i| (10-i)%10}

puts a.sum + b.sum - b.max