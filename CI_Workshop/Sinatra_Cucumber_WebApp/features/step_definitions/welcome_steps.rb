Given /^I am viewing my page$/ do
  visit('/')
end

Then /^I should see "([^"]*)"$/ do |text|
  expect(last_response.body).to match(/#{text}/m)
end
