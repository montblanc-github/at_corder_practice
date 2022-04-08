S = gets.chomp

none = true

('a'..'z').to_a.each{|c|
    if !S.include?(c)
        puts c
        none = false
        break
    end
}

puts "None" if none