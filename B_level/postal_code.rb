A,B = gets.split.map(&:to_i)

puts gets =~ /\d{#{A}}-\d{#{B}}/ ? "Yes" : "No"