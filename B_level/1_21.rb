str = gets.gsub(" ","").to_i

for i in 1..1000 do
    if i*i == str
        puts "Yes"
        exit
    end
end

puts "No"