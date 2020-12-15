using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsumirServicio
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a;
            a = Convert.ToInt32(textBox1.Text);

            ServicioConsulta.ServicioSoapClient ws = new ServicioConsulta.ServicioSoapClient();

            ServicioJava.ServidorClient sj = new ServicioJava.ServidorClient();

            DataSet c = ws.Consulta(a);

            List<String> dat=new List<String>();

            Object[] datas=sj.operation(a);
            
            listBox1.Items.Clear();
            for (int i = 0; i < datas.LongLength ; i++)
            {
                listBox1.Items.Add(datas[i]);
            }
            dataGridView1.ReadOnly = true;
            dataGridView1.DataSource = c.Tables[0];
            
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
