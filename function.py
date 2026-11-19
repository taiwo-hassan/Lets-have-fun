
def temperature ( value,unit) :

         
        if unit =='c' :
            fahrenheit=((value-32)*5/9)
            if fahrenheit <50 :
              return( "cold advisory")
            else :
                return("Heat alert")
        elif(unit=='f') :
            celcius=((f-32)*9/5)
            if celcius <50 :
              return "cold advisory"
            else :
                return"Heat alert"
            
            
            
    
