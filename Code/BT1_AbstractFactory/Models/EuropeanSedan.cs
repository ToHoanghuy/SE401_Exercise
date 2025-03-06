using BT1_AbstractFactory.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Models
{
    public class EuropeanSedan : ISedan
    {
        public string GetEngine() => "2.0L Turbo Diesel";
        public string GetSeat() => "Leather Seats";
        public string GetSize() => "Medium";
    }
}
