select w1.id
from Weather w1,Weather w2
where w1.Temperature>w2.Temperature
and DATEDIFF(w1.recorddate,w2.recorddate)=1;