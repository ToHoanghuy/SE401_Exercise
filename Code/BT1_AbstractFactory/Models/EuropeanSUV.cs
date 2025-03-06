using BT1_AbstractFactory.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Models
{
    public class EuropeanSUV : ISUV
    {
        public string GetEngine() => "3.0L V6 Diesel";
        public string GetSeat() => "Premium Leather";
        public string GetSize() => "Large";
    }
}
