require 'sinatra'

get '/' do
  erb :index, :locals => { :message => 'Welcome to my page!' }
end
