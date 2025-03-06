using BT1_AbstractFactory.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Models
{
    public class EuropeanElectronic : IElectronic
    {
        public string GetEngine() => "200 kW Electronic Motor";
        public string GetSeat() => "Heated Leather";
        public string GetSize() => "Medium";
    }
}
