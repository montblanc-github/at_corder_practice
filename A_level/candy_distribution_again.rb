N,x = gets.split.map(&:to_i)
sweets = gets.split.map(&:to_i).sort
 
if sweets.sum == x
    puts N
else
    kids = 0
    sweets.each do |i|
        if x >= i
            kids += 1
            x -= i
        else
            break
        end
    end
    puts [kids, N-1].min
end